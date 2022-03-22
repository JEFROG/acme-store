import React from 'react';
import ProductCategoryRow from "./ProductCategoryRow";
import ProductRow from "./ProductRow";
import ClayTable from '@clayui/table';
import ClayEmptyState from "@clayui/empty-state";

import {useApi} from "../../control/ApiProvider";

export default function ProductsTable({page})  {

	const rows = [];
	let lastCategory = null;

	const{ imgSrc } = useApi();

	if(!page.totalCount)  return <ClayEmptyState
		description="Sorry, there are no products found"
		imgProps={{ alt: "Alternative Text", title: "Product Seach" }}
		imgSrc={`${imgSrc}/states/search_state.gif`}
		title="No products found"
	/>


	page.items.forEach((product) => {

		if (product.category !== lastCategory) {
			rows.push(
				<ProductCategoryRow
					category={product.category}
					key={product.category} />
			);
		}
		rows.push(
			<ProductRow
				product={product}
				key={product.id}
			/>
		);
		lastCategory = product.category;
	});

	return (
		<div>
			<ClayTable hover={false} borderless={true}>
				<ClayTable.Head>
					<ClayTable.Row>
						<ClayTable.Cell headingCell>Name</ClayTable.Cell>
						<ClayTable.Cell headingCell>Price</ClayTable.Cell>
					</ClayTable.Row>
				</ClayTable.Head>
				<ClayTable.Body>
					{rows}
				</ClayTable.Body>
			</ClayTable>
		</div>
		);
}
