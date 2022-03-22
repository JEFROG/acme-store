import React from 'react';
import ReactDOM from 'react-dom';
import { HashRouter, Route, Routes } from "react-router-dom";
import { ApiProvider } from "./app/control/ApiProvider";
import ProductsContainer from "./app/boundary/products/ProductsContainer";
import DeleteContainer from "./app/boundary/product-delete/DeleteContainer";
import AddContainer from "./app/boundary/product-add/AddContainer";
import EditContainer from "./app/boundary/product-edit/EditContainer";

export default function(elementId) {

	ReactDOM.render(
		<ApiProvider
			baseURL="/o/rest-products/v1.0/products"
			imgSrc={themeDisplay.getPathThemeImages()}
			spritemap={`${themeDisplay.getPathThemeImages()}/clay/icons.svg`}
			authToken={Liferay.authToken}
		>
			<HashRouter>
				<Routes>
					<Route path="/" element={<ProductsContainer />}/>
					<Route path="/add" element={<AddContainer />}/>
					<Route path="/delete/:productId" element={<DeleteContainer />}/>
					<Route path="/edit/:productId" element={<EditContainer />}/>
				</Routes>
			</HashRouter>
		</ApiProvider>,
		document.getElementById(elementId)
	);
}