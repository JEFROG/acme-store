import React from 'react';
import ClayManagementToolbar from "@clayui/management-toolbar";
import {ClayCheckbox, ClayInput} from "@clayui/form";
import {ClayButtonWithIcon} from "@clayui/button";
import { useNavigate } from "react-router-dom";
import {useApi} from "../../control/ApiProvider";

export default function SearchBar({searchText, setSearchText, setInStockOnly})  {
	let navigate = useNavigate();
	const { spritemap } = useApi();

	function handleClick() {
		navigate("/add");
	}
		return (

			<ClayManagementToolbar>
				<ClayManagementToolbar.ItemList>
					<ClayManagementToolbar.Item>
						<ClayCheckbox
							label={"Show in stock only"}
							onClick={(e) => setInStockOnly(e.target.checked)}
						/>
					</ClayManagementToolbar.Item>
				</ClayManagementToolbar.ItemList>

				<ClayManagementToolbar.Search>
					<ClayInput.Group>
						<ClayInput.GroupItem>
							<ClayInput
								type="text"
								value={searchText}
								placeholder="Search..."
								className="form-control input-group-inset input-group-inset-after"
								onChange={(e) => {
									setSearchText(e.target.value);
								}}
							/>
							<ClayInput.GroupInsetItem after tag="span">
								{searchText && <ClayButtonWithIcon
									type={"button"}
									displayType="unstyled"
									onClick={(e) => {
										setSearchText('');
									}}
									spritemap={spritemap}
									symbol="times"
								/>}
							</ClayInput.GroupInsetItem>
						</ClayInput.GroupItem>
				</ClayInput.Group>
			</ClayManagementToolbar.Search>

				<ClayManagementToolbar.ItemList>
					<ClayManagementToolbar.Item>
						<ClayButtonWithIcon
							className="nav-btn nav-btn-monospaced"
							onClick={handleClick}
							spritemap={spritemap}
							symbol="plus"
						/>
					</ClayManagementToolbar.Item>

				</ClayManagementToolbar.ItemList>
			</ClayManagementToolbar>

		);

}