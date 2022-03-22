export interface Page<T> {
    actions: any;
    facets: any[];
    items: Array<T>;
    lastPage: number;
    page: number;
    pageSize: number;
    totalCount: number;
}