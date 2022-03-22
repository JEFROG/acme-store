import React, {useState, useEffect} from 'react';
import { useFormik } from 'formik';
import { useNavigate, useParams } from "react-router-dom";
import ClayLoadingIndicator from "@clayui/loading-indicator";
import Edit from "./Edit";
import {useApi} from "../../control/ApiProvider";
import ClayEmptyState from "@clayui/empty-state";

export default function EditContainer() {
	const [error, setError] = useState(null);
	const params = useParams();

	const { client, imgSrc } = useApi();

	// navigate provides the ability to switch routes

	let navigate = useNavigate();

	const formik = useFormik({
		initialValues: {
			id: '',
			name: '',
			price:'',
			category: '',
			stocked: false
		},
		validateOnMount: true,
		validateOnChange: true,
		validate: values => {
			let errors = {};
			if(!values.name) {
				errors.name = 'Required!';
			}
			if(!values.category) {
				errors.category = 'Required!';
			}
			if(!values.price) {
				errors.price = 'Required!';
			}

			return errors;
		},
		onSubmit:  values => {
			client
				.put(`/${product.id}`,JSON.stringify(values))
				.then(() => {
					navigate("/");
				})
				.catch(error => setError(error.message));
		},
		onReset: (values) => {
			navigate("/");
		},
	});

	// Hook to get product on initial render and pass to Edit - runs once (empty dependency)
	const [product, setProduct] = useState(null);
	useEffect(() => {
		client.get(`/${params.productId}`)
			.then((entity) => {
				setProduct(entity);
				formik.setValues({
					price: entity.price,
					name: entity.name,
					stocked: entity.stocked,
					category: entity.category,
					id: entity.id
				})
			})
			.catch(error => setError(error.message));
	}, []);

	if(error) return <ClayEmptyState title="Error" description={error} imgSrc={`${imgSrc}/states/empty_state.gif`}/>

	if(!product) return <ClayLoadingIndicator/>

	return (

		<div>

			<Edit formik={formik}/>

		</div>

	);
}