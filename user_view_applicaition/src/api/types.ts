export type SortOrder = 'asc' | 'desc';

export interface SortModel {
  field: string;
  order: SortOrder;
}

export interface PageRequest {
  page: number;
  size: number;
  sort?: SortModel[];
}

export interface PageResponse<T> {
  content: T[];
  page: number;
  size: number;
  totalElements: number;
  totalPages: number;
  first: boolean;
  last: boolean;
}

export interface ApiError {
  message: string;
  status?: number;
  code?: string;
}
