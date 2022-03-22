import React, { useState, useEffect } from 'react';
import { useNavigate, useParams } from "react-router-dom";
import ClayLoadingIndicator from "@clayui/loading-indicator";
import Delete from "./Delete";
import {useApi} from "../../control/ApiProvider";
import { useFormik } from 'formik';
import ClayEmptyState from "@clayui/empty-state";
/**
 * This container renders the form and listens for updates
 * from the form and controls submission of the data to
 * the rest api.
 * @returns {JSX.Element}
 * @constructor
 */
export default function DeleteContainer() {
	const [error, setError] = useState(null);
	const params = useParams();

	const navigate = useNavigate();

	const { client, imgSrc } = useApi();

	const formik = useFormik({
		initialValues: {
			confirmDelete: false
		},
		validateOnMount: true,
		validateOnChange: true,
		validate: values => {
			let errors = {};
			if(!values.confirmDelete) {
				errors.confirmDelete = 'Must check box to enable deletion of this product';
			}

			return errors;
		},
		onSubmit:  values => {
			client
				.delete(`/${product.id}`)
				.then(() => {
					navigate("/");
				})
				.catch(error => setError(error.message));
		},
		onReset: (values) => {
			navigate("/");
		},
	});

	// Hook to get product on initial render and pass to Delete - runs once (empty dependency)
	const [product, setProduct] = useState({});
	useEffect(() => {
		client.get(`/${params.productId}`)
			.then((entity) => {
				setProduct(entity);
			})
			.catch(error => setError(error.message));
	}, []);

	if(error) return <ClayEmptyState title="Error" description={error} imgSrc={`${imgSrc}/states/empty_state.gif`}/>

	if(!product) return <ClayLoadingIndicator/>

	return (

		<div>

			<Delete product={product} formik={formik}/>

		</div>

	);
}