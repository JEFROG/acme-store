import { Component, Input } from '@angular/core';
import { Router } from "@angular/router";

import { Product } from "../../entity/product";
import { Page } from "../../entity/page";
import { config } from "../../config";

@Component({
	selector: 'app-product-table-ui',
	template: `
		<ng-container *ngIf="page && page.totalCount > 0; else elseBlock">
			<table class="table">
				<thead>
					<tr>
						<th>{{Liferay.Language.get('name')}}</th>
						<th>{{Liferay.Language.get('price')}}</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<ng-container *ngFor="let item of page.items;let index = index">
						<!-- display header row when category changes -->
						<tr class="table-divider"  *ngIf="!page.items[index-1] || item.category !== page.items[index-1].category">
							<td colspan="3">
								{{item.category}}
							</td>
						</tr>
						
						<!-- otherwise, display product content -->
						<tr>
							<td>
								<div class="table-title">
									<span>{{item.name}}</span>
									<span *ngIf="!item.stocked" class="label label-danger">
										<span class="label-item label-item-expand">Out of stock</span>
									</span>
								</div>
							</td>
							<td>{{item.price | currency}}</td>
							<td class="table-column-text-end">
								<div class="btn-group btn-group-nowrap">
									<div class="btn-group-item">
										<button class="btn btn-sm btn-link" type="button" (click)="onEdit(item.id)">
	
												<svg aria-hidden="true" class="lexicon-icon lexicon-icon-pencil" focusable="false">
													<use [attr.href]="iconsURL + '#pencil'"></use>
												</svg>
	
										</button>
										<button class="btn btn-sm btn-link" type="button" (click)="onDelete(item.id)">
	
												<svg aria-hidden="true" class="lexicon-icon lexicon-icon-trash" focusable="false">
													<use [attr.href]="iconsURL + '#trash'"></use>
												</svg>
	
										</button>
									</div>
								</div>
							</td>
						</tr>
					</ng-container>
				</tbody>
			</table>
		</ng-container>
		<ng-template #elseBlock>
			<div class="c-empty-state c-empty-state-animation">
				<div class="c-empty-state-image">
					<div class="c-empty-state-aspect-ratio">
						<img
							alt="empty-state-image"
							class="aspect-ratio-item aspect-ratio-item-fluid"
							src="{{imagesURL + '/states/search_state.gif'}}"
						/>
					</div>
				</div>
				<div class="c-empty-state-title">
					<span class="text-truncate-inline">
						<span class="text-truncate">{{Liferay.Language.get('product-search')}}</span>
					</span>
				</div>
				<div class="c-empty-state-text">{{Liferay.Language.get('sorry-there-are-no-products-that-match-the-search-criteria')}}</div>
			</div>
		</ng-template>
	`,
	styles: []
})

export class ProductTableComponent {

	@Input() page: Page<Product>;

	imagesURL = config.imagesURL;
	iconsURL = config.iconsURL;

	constructor(private router: Router) {
	}

	onEdit(productId: number): void {

		this.router.navigate(['/putProduct', productId]);

	}

	onDelete(productId: number): void {

		this.router.navigate(['/deleteProduct', productId]);

	}

}