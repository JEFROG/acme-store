// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
declare let Liferay: any;
export const config = {
    production: false,
    apiUrl: '/o/rest-products/v1.0/products',
    imagesURL: Liferay.ThemeDisplay.getPathThemeImages(),
    iconsURL: '/o/admin-theme/images/clay/icons.svg',
    authToken: Liferay.authToken
};

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/plugins/zone-error';  // Included with Angular CLI.
