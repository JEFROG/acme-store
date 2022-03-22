import { Injectable, OnDestroy } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged } from 'rxjs/operators';
import {Query} from "../entity/query";

@Injectable()
export class ProductPresenter implements OnDestroy {

    private _query: Subject<Query> = new Subject();

    query$: Observable<Query> = this._query.pipe(

        // wait after each keystroke before considering the term

        debounceTime(300),

        // ignore new term if same as previous term

        distinctUntilChanged(),

    );

    query(query: Query): void {

        this._query.next(query);

    }

    ngOnDestroy(): void {

        this._query.complete();

    }

}