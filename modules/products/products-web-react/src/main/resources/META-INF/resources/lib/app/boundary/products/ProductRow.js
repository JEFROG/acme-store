import React from 'react';
import ClayTable from "@clayui/table";
import ClayLabel from '@clayui/label';
import {useNavigate} from "react-router-dom";
import ClayButton, {ClayButtonWithIcon} from "@clayui/button";

export default function ProductRow({product}) {
	const navigate = useNavigate();
	const spritemap = `${themeDisplay.getPathThemeImages()}/clay/icons.svg`;
	const handleDelete = () => {
		navigate(`/delete/${product.id}`);
	}

	const handleEdit = () => {
		navigate(`/edit/${product.id}`);
	}

	return (
		<ClayTable.Row>
			<ClayTable.Cell headingTitle={"true"} >
				<span>
					{product.name}{!product.stocked && <ClayLabel style={{marginLeft: '3px'}} displayType="danger">OUT OF STOCK</ClayLabel>}
				</span>
			</ClayTable.Cell>
			<ClayTable.Cell>{product.price}</ClayTable.Cell>
			<ClayTable.Cell align="right">
				<ClayButton.Group spaced={true}>
					<ClayButtonWithIcon
						displayType={"link"}
						className="nav-btn nav-btn-monospaced"
						onClick={handleEdit}
						spritemap={spritemap}
						symbol="pencil"
					/>
					<ClayButtonWithIcon
						displayType={"link"}
						className="nav-btn nav-btn-monospaced"
						onClick={handleDelete}
						spritemap={spritemap}
						symbol="trash"
					/>
				</ClayButton.Group>
			</ClayTable.Cell>
		</ClayTable.Row>
	);
}
