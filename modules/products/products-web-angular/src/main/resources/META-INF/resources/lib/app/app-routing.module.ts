import {ANALYZE_FOR_ENTRY_COMPONENTS, NgModule} from '@angular/core';
import {RouterModule, Routes, ROUTES} from '@angular/router';
import {ProductTableContainer} from "./boundary/products/product-table.container";
import {PageResolver} from "./control/page.resolver";
import {ProductResolver} from "./control/product.resolver";
import {ProductAddContainer} from "./boundary/product-add/product-add.container";
import {ProductEditContainer} from "./boundary/product-edit/product-edit.container";
import {ProductDeleteContainer} from "./boundary/product-delete/product-delete.container";

const routes: Routes = [
    {
        path: 'deleteProduct/:productId',
        component: ProductDeleteContainer,
        resolve: { product: ProductResolver }
    },{
        path: 'putProduct/:productId',
        component: ProductEditContainer,
        resolve: { product: ProductResolver }
    },{
        path: 'postProduct',
        component: ProductAddContainer
    },{
        path: 'productsPage',
        component: ProductTableContainer,
        resolve: {page: PageResolver}
    },
    { path: '',  redirectTo: '/productsPage', pathMatch: 'prefix' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes, {useHash: true})],
    exports: [RouterModule]
})
export class AppRoutingModule { }