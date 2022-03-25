import React from "react";

import ClayForm, {ClayCheckbox, ClayInput} from '@clayui/form';
import ClayButton from "@clayui/button";
import { ClaySelect } from "@clayui/form";
import ClayAlert from "@clayui/alert";
import ClayIcon from "@clayui/icon";

import { useApi } from "../../control/ApiProvider";

/**
 * The Add component is the actual forn for entering
 * product data.  This form manages its own state
 * and upon form submission, sets a JSON object value.
 *
 * This example implements Formik for the form.
 *
 * @param formik - handles all form data, including submit and cancel
 *
 * @returns {JSX.Element}
 * @constructor
 */
export default function Edit({formik}) {

	const { spritemap } = useApi();

	return (
		<div className={"sheet sheet-lg"}>
			<div className="sheet-header">
				<h2 className="sheet-title">{Liferay.Language.get('edit-product')}</h2>
			</div>
			<ClayForm onSubmit={(e) => { e.preventDefault(); formik.handleSubmit(e)}}>

				{/* category field */}

				<ClayForm.Group className="form-group-sm">
					<label htmlFor="category">{Liferay.Language.get('category')}
						<ClayIcon symbol="asterisk" className={"lexicon-icon lexicon-icon-asterisk reference-mark text-warning"} spritemap={spritemap} />
					</label>
					<ClaySelect
						id="category"
						name="category"
						value={formik.values.category}
						aria-label={Liferay.Language.get('category')}
						onChange={formik.handleChange}
						onBlur={formik.handleBlur}
					>
						<ClaySelect.Option disabled label={Liferay.Language.get('select-a-category')} value=""></ClaySelect.Option>
						<ClaySelect.Option label={Liferay.Language.get('electronics')} value="Electronics"></ClaySelect.Option>
						<ClaySelect.Option label={Liferay.Language.get('sporting-goods')} value="Sporting Goods"></ClaySelect.Option>
					</ClaySelect>
					{formik.errors.category  && formik.touched.category &&
						<div className="c-mt-3">
							<ClayAlert displayType="danger" spritemap={spritemap} title={formik.errors.category} variant="feedback" />
						</div>
					}
				</ClayForm.Group>

				{/* name field */}

				<ClayForm.Group className="form-group-sm">
					<label htmlFor="name">{Liferay.Language.get('name')}
						<ClayIcon symbol="asterisk" className={"lexicon-icon lexicon-icon-asterisk reference-mark text-warning"} spritemap={spritemap} />
					</label>
					<ClayInput
						id="name"
						name="name"
						value={formik.values.name}
						placeholder={Liferay.Language.get('enter-name')}
						type="text"
						onChange={formik.handleChange}
						onBlur={formik.handleBlur}
					></ClayInput>
					{formik.errors.name  && formik.touched.name &&
						<div className="c-mt-3">
							<ClayAlert displayType="danger" spritemap={spritemap} title={formik.errors.name} variant="feedback" />
						</div>
					}
				</ClayForm.Group>

				{/* price field */}

				<ClayForm.Group className="form-group-sm">
					<label htmlFor="price">{Liferay.Language.get('price')}
						<ClayIcon symbol="asterisk" className={"lexicon-icon lexicon-icon-asterisk reference-mark text-warning"} spritemap={spritemap} />
					</label>
					<ClayInput
						id="price"
						name="price"
						value={formik.values.price}
						placeholder={Liferay.Language.get('enter-price')}
						type="text"
						onChange={formik.handleChange}
						onBlur={formik.handleBlur}
					></ClayInput>
					{formik.errors.price  && formik.touched.price &&
						<div className="c-mt-3">
							<ClayAlert displayType="danger" spritemap={spritemap} title={formik.errors.price} variant="feedback" />
						</div>
					}
				</ClayForm.Group>

				{/* stocked field */}

				<ClayCheckbox
					id="stocked"
					name="stocked"
					aria-label={Liferay.Language.get('product-is-in-stock')}
					label={Liferay.Language.get('product-is-in-stock')}
					onChange={formik.handleChange}
					checked={formik.values.stocked}
				/>

				{/* Edit and Cancel buttons */}

				<ClayButton.Group spaced={true}>
					<ClayButton type="submit" disabled={!formik.isValid}>{Liferay.Language.get('edit')}</ClayButton>
					<ClayButton onClick={(e) => { e.preventDefault(); formik.handleReset(e)}} displayType="secondary" type="button">{Liferay.Language.get('cancel')}</ClayButton>
				</ClayButton.Group>

			</ClayForm>
		</div>
	);

};
