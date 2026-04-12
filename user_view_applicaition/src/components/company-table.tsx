import { Company } from '@/types/company';
import { SimpleTable } from './simple-table';

export function CompanyTable({ items }: { items: Company[] }) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'name', title: 'Название', render: (item) => item.name },
        { key: 'iata', title: 'IATA', render: (item) => item.iataCode ?? '—' },
        { key: 'icao', title: 'ICAO', render: (item) => item.icaoCode ?? '—' },
      ]}
    />
  );
}
