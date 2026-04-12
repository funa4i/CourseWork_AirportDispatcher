import { Aircraft } from '@/types/aircraft';
import { SimpleTable } from './simple-table';

export function AircraftTable({ items }: { items: Aircraft[] }) {
  return (
    <SimpleTable
      items={items}
      columns={[
        { key: 'id', title: 'ID', render: (item) => item.id },
        { key: 'registrationNumber', title: 'Рег. номер', render: (item) => item.registrationNumber },
        { key: 'serialNumber', title: 'Серийный номер', render: (item) => item.serialNumber ?? '—' },
        { key: 'aircraftType', title: 'Тип', render: (item) => item.aircraftType ?? '—' },
      ]}
    />
  );
}
