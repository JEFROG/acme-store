import React from "react";
import ClayForm, { ClayCheckbox } from '@clayui/form';
import ClayButton from "@clayui/button";
import ClayAlert from "@clayui/alert";

import {useApi} from "../../control/ApiProvider";

/**
 * The Add component is the actual forn for entering
 * product data.  This form manages its own state
 * and upon form submission, sets a JSON object value
 *
 * @param setProduct - function of AddContainer that wil
 * submite the data to the rest api
 *
 * @returns {JSX.Element}
 * @constructor
 */
export default function Delete ({product, formik})  {

	const { spritemap } = useApi();

	return (
		<div className={"sheet sheet-lg"}>
			<div className="sheet-header">
				<h2 className="sheet-title">Delete Product</h2>
				<div className="sheet-text">
					{product.name}
				</div>
			</div>
			<ClayForm onSubmit={(e) => { e.preventDefault(); formik.handleSubmit(e)}}>

				{/* confirm delete */}

					<ClayCheckbox
						id="confirmDelete"
						name="confirmDelete"
						aria-label="Click checkbox to confirm deletion"
						label={"Click checkbox to confirm deletion"}
						onChange={formik.handleChange}
						onBlur={formik.handleBlur}
						checked={formik.values.confirmDelete}
					/>
				
				{formik.errors.confirmDelete  && formik.touched.confirmDelete &&
					<div className="c-mt-3">
						<ClayAlert
							displayType="danger"
							spritemap={spritemap}
							title={formik.errors.confirmDelete}
							variant="feedback" />
					</div>
				}

				{/* Delete and Cancel buttons */}

				<ClayButton.Group spaced={true}>
					<ClayButton type="submit" disabled={!formik.isValid}>{"Delete"}</ClayButton>
					<ClayButton onClick={(e) => { e.preventDefault(); formik.handleReset(e)}} displayType="secondary" type="button">{"Cancel"}</ClayButton>
				</ClayButton.Group>

			</ClayForm>
		</div>

	);

};
