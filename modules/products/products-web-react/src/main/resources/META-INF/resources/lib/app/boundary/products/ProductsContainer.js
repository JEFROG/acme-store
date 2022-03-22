import React, {useEffect, useState} from 'react';
import ClayLoadingIndicator from "@clayui/loading-indicator";
import ClayEmptyState from "@clayui/empty-state";
import SearchBar from './SearchBar';
import ProductsTable from "./ProductsTable";
import { useApi } from "../../control/ApiProvider";

export default function ProductsContainer() {
	const {client, imgSrc} = useApi();
	const [page, setPage] = useState(null);
	const [searchText, setSearchText] = useState('');
	const [error, setError] = useState(null);
	const [inStockOnly, setInStockOnly] = useState(false);

	useEffect(() => {
		client.get('', { params: { search: searchText } })
			.then((entity) => {
				if (inStockOnly) {

					const stockItems = entity.items.filter(item => item.stocked);

					entity.items = stockItems;
				}

				setPage(entity);
			})
			.catch(error => setError(error.message));
	}, [searchText, inStockOnly]);

	if(error) return <ClayEmptyState title="Error" description={error} imgSrc={`${imgSrc}/states/empty_state.gif`}/>

	if(!page) return <ClayLoadingIndicator/>

	return (
		<div>
			<SearchBar searchText={searchText} setSearchText={setSearchText} setInStockOnly={setInStockOnly}/>
			<ProductsTable page={page}/>
		</div>

	);
}