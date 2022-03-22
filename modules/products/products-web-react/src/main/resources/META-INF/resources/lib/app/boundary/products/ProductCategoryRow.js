import React from 'react';
import ClayTable from "@clayui/table";

export default function ProductCategoryRow({category}) {
	return (
		<ClayTable.Row divider>
			<ClayTable.Cell colSpan="3">
				{category}
			</ClayTable.Cell>
		</ClayTable.Row>
	);
}