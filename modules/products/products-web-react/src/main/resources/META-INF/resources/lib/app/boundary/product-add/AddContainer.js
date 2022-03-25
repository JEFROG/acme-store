import React, {useState} from 'react';
import { useNavigate } from "react-router-dom";
import { useFormik } from 'formik';

import Add from "./Add";
import {useApi} from "../../control/ApiProvider";
import ClayEmptyState from "@clayui/empty-state";
/**
 * This container renders the form and listens for updates
 * from the form and controls submission of the data to
 * the rest api.
 * @returns {JSX.Element}
 * @constructor
 */
export default function AddContainer() {

	// navigate provides the ability to switch routes
	const [error, setError] = useState(null);

	let navigate = useNavigate();

	const { client, imgSrc } = useApi();

	const formik = useFormik({
		initialValues: {
			category: '',
			name: '',
			price: '',
			stocked: true
		},
		validateOnMount: true,
		validateOnChange: true,
		validate: values => {
			let errors = {};
			if(!values.name) {
				errors.name = Liferay.Language.get('required');
			}
			if(!values.category) {
				errors.category = Liferay.Language.get('required');
			}
			if(!values.price) {
				errors.price = Liferay.Language.get('required');
			}

			return errors;
		},
		onSubmit:  values => {
			client
				.post('',JSON.stringify(values))
				.then(() => {
					navigate("/");
				})
				.catch(error => setError(error.message));
		},
		onReset: (values) => {
			navigate("/");
		},
	});

	if(error) return <ClayEmptyState title={Liferay.Language.get('error')} description={error} imgSrc={`${imgSrc}/states/empty_state.gif`}/>

	return (

		<div>

			<Add formik={formik}/>

		</div>

	);
}