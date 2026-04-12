import { ReactNode } from 'react';

export interface TableColumn<T> {
  key: string;
  title: string;
  render: (item: T) => ReactNode;
}

interface SimpleTableProps<T> {
  items: T[];
  columns: TableColumn<T>[];
  emptyText?: string;
}

export function SimpleTable<T>({ items, columns, emptyText = 'Нет данных' }: SimpleTableProps<T>) {
  return (
    <table style={{ width: '100%', borderCollapse: 'collapse' }}>
      <thead>
        <tr>
          {columns.map((column) => (
            <th
              key={column.key}
              style={{ border: '1px solid #ddd', textAlign: 'left', padding: 8 }}
            >
              {column.title}
            </th>
          ))}
        </tr>
      </thead>
      <tbody>
        {items.length === 0 ? (
          <tr>
            <td colSpan={columns.length} style={{ border: '1px solid #ddd', padding: 8 }}>
              {emptyText}
            </td>
          </tr>
        ) : (
          items.map((item, index) => (
            <tr key={index}>
              {columns.map((column) => (
                <td key={column.key} style={{ border: '1px solid #ddd', padding: 8 }}>
                  {column.render(item)}
                </td>
              ))}
            </tr>
          ))
        )}
      </tbody>
    </table>
  );
}
