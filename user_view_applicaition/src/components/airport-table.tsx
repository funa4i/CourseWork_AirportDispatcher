import { Airport } from '@/types/airport';
import { SimpleTable } from './simple-table';

export function AirportTable({ items }: { items: Airport[] }) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'name', title: 'Название', render: (item) => item.name },
        { key: 'city', title: 'Город', render: (item) => item.city ?? '—' },
        { key: 'country', title: 'Страна', render: (item) => item.country ?? '—' },
      ]}
    />
  );
}
