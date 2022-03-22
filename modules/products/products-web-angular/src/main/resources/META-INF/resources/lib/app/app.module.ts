import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import {APP_BASE_HREF, CommonModule} from '@angular/common';

import { AppComponent }  from './app.component';
import { AppRoutingModule } from "./app-routing.module";
import { ProductTableContainer } from "./boundary/products/product-table.container";
import { ProductTableComponent } from "./boundary/products/product-table.component";
import { SearchBarComponent } from "./boundary/products/search-bar.component";
import { ProductsService } from "./control/products.service";
import { ProductResolver } from "./control/product.resolver";
import { PageResolver } from "./control/page.resolver";
import { ProductPresenter } from "./control/product.presenter";
import { ProductEditComponent } from "./boundary/product-edit/product-edit.component";
import { ProductEditContainer } from "./boundary/product-edit/product-edit.container";
import { ProductAddContainer } from "./boundary/product-add/product-add.container";
import { ProductAddComponent } from "./boundary/product-add/product-add.component";
import { ProductDeleteContainer } from "./boundary/product-delete/product-delete.container";
import { ProductDeleteComponent } from "./boundary/product-delete/product-delete.component";

@NgModule({
	imports: [
		BrowserModule,
		CommonModule,
		FormsModule,
		HttpClientModule,
		ReactiveFormsModule,
		RouterModule,
		AppRoutingModule
	],
	declarations: [
		AppComponent,
		ProductTableContainer,
		ProductTableComponent,
		SearchBarComponent,
		ProductEditContainer,
		ProductEditComponent,
		ProductAddContainer,
		ProductAddComponent,
		ProductDeleteContainer,
		ProductDeleteComponent
	],
	entryComponents: [AppComponent],
	bootstrap: [], // Do not bootstrap anything (see ngDoBootstrap() below)
	providers: [ ProductPresenter, ProductsService, ProductResolver, PageResolver, {provide: APP_BASE_HREF, useValue: '/'}]
})
export class AppModule {

	// Avoid bootstraping any component statically because we need to attach to
	// the portlet's DOM, which is different for each portlet instance and,
	// thus, cannot be determined until the page is rendered (during runtime).

	ngDoBootstrap() {}
}