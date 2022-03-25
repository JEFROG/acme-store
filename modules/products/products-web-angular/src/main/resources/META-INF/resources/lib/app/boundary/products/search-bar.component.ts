import { Component } from '@angular/core';
import { FormControl } from "@angular/forms";
import { Router } from "@angular/router";

import { ProductPresenter } from "../../control/product.presenter";
import { Query } from "../../entity/query";
import {config} from "../../config";
@Component({
    selector: 'app-search-bar',
    template: `
        <nav class="management-bar management-bar-light navbar navbar-expand-md">
            <div class="container-fluid container-fluid-max-xl">
                <ul class="navbar-nav">
                    
                    <!-- checkbox for toggling in stock -->
                    
                    <li class="nav-item">
                        <div class="custom-control custom-checkbox">
                            <label>
                                <input [formControl]="filterControl" class="custom-control-input" type="checkbox" (change)="onChange()"/>
                                <span class="custom-control-label" style="padding-left: 10px;">{{Liferay.Language.get('show-in-stock-only')}}</span>
                            </label>
                        </div>
                    </li>
                </ul>
                
                <div class="navbar-form navbar-form-autofit navbar-overlay navbar-overlay-sm-down">
                    <div class="container-fluid container-fluid-max-xl">
                        <form role="search">
                            <div class="input-group">

                                <!-- input for search text -->
                                
                                <div class="input-group-item">
                                    <input
                                            [formControl]="searchControl"
                                            class="form-control input-group-inset input-group-inset-after"
                                            placeholder=Liferay.Language.get('search')
                                            type="text"
                                            (keyup)="onSearch($event)"
                                    />

                                    <!-- button to clear search text -->
                                    
                                    <span class="input-group-inset-item input-group-inset-item-after">
                                        <button
                                                *ngIf="searchControl.value"
                                                (click)="onClear()"
                                                class="btn btn-monospaced btn-unstyled"
                                                type="button"
                                        >

                                                <svg aria-hidden="true" class="lexicon-icon lexicon-icon-times" focusable="false">
                                                    <use [attr.href]="iconsURL + '#times'"></use>
                                                </svg>

                                        </button>
									</span>
                                    
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                
                <ul class="navbar-nav">

                    <!-- button to add new product -->
                    
                    <li class="nav-item">
                        <button
                                class="btn btn-primary nav-btn nav-btn-monospaced navbar-breakpoint-down-d-none"
                                type="button"
                                (click)="onAdd()"
                        >
                            <svg class="lexicon-icon lexicon-icon-plus" role="presentation">
                                <use [attr.href]="iconsURL + '#plus'"></use>
                            </svg>
                            
                        </button>
                    </li>
                    
                </ul>
            </div>
        </nav>
    `,
})
export class SearchBarComponent {
    iconsURL = config.iconsURL;
    searchControl: FormControl = new FormControl('');

    filterControl: FormControl = new FormControl(false);

    constructor(private presenter: ProductPresenter, private router: Router) {
    }

    onAdd(): void {

        // navigate to the add page

        this.router.navigate(['/postProduct']);

    }

    // listen for checkbox updates

    onChange(): void {

        this.presenter.query(this._query());

    }

    onClear(): void {

        // clear search control

        this.searchControl.setValue('');

        // send new query to presenter

        this.presenter.query(this._query());

    }

    onSearch(event: any): void {

        // send new query to presenter

        this.presenter.query(this._query());

    }

    private _query(): Query {

        const searchTerm: string = this.searchControl.value;

        const filter: boolean = this.filterControl.value;

        const query: Query = {searchTerm, filter};

        return query;

    }

}