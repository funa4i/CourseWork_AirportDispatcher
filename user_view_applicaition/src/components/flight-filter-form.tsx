import { ChangeEvent } from 'react';
import { FlightFilter, FlightType } from '@/types/flight';

interface FlightFilterFormProps {
  value: FlightFilter;
  onChange: (next: FlightFilter) => void;
}

export function FlightFilterForm({ value, onChange }: FlightFilterFormProps) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement | HTMLSelectElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({
      ...value,
      [name]: fieldValue || undefined,
      page: 0,
    });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input
        name="flightNumber"
        placeholder="Номер рейса"
        value={value.flightNumber ?? ''}
        onChange={handleInputChange}
      />
      <input
        name="companyId"
        placeholder="ID компании"
        value={value.companyId ?? ''}
        onChange={handleInputChange}
      />
      <select
        name="flightType"
        value={value.flightType ?? ''}
        onChange={handleInputChange}
      >
        <option value="">Все направления</option>
        <option value="ARRIVAL">Прилёт</option>
        <option value="DEPARTURE">Вылет</option>
      </select>
      <input
        name="status"
        placeholder="Статус"
        value={value.status ?? ''}
        onChange={handleInputChange}
      />
    </div>
  );
}
