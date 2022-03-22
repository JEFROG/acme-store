import React, { useState } from 'react';
import axios from 'axios';

const ApiContext = React.createContext();

function ApiProvider ( { baseURL, spritemap, imgSrc, authToken, children} ) {

	const client = axios.create({
		baseURL: baseURL,
		headers: {
			"cache-control": 'no-cache',
			'x-csrf-token': authToken,
			'Content-Type': 'application/json'
		}
	});

	client.interceptors.response.use(function (response) {
		// Any status code that lie within the range of 2xx cause this function to trigger
		// Do something with response data
		return response.data;
	}, function (error) {
		// Any status codes that falls outside the range of 2xx cause this function to trigger
		// Do something with response error
		return Promise.reject(error);
	});

	const context = {client: client, spritemap: spritemap, imgSrc: imgSrc};
	return (
		<ApiContext.Provider value={ context }>
			{ children }
		</ApiContext.Provider>
	);

}

function useApi() {
	const context = React.useContext(ApiContext);
	if(context  === undefined){
		throw new Error('ApiContext is not within ApiProvider')
	}
	return context;
}

export {useApi, ApiProvider}