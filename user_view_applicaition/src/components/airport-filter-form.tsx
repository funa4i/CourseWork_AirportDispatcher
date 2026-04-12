import { ChangeEvent } from 'react';
import { AirportFilter } from '@/types/airport';

export function AirportFilterForm({ value, onChange }: { value: AirportFilter; onChange: (next: AirportFilter) => void }) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({ ...value, [name]: fieldValue || undefined, page: 0 });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input name="name" placeholder="Название аэропорта" value={value.name ?? ''} onChange={handleInputChange} />
      <input name="city" placeholder="Город" value={value.city ?? ''} onChange={handleInputChange} />
      <input name="country" placeholder="Страна" value={value.country ?? ''} onChange={handleInputChange} />
      <input name="iataCode" placeholder="IATA" value={value.iataCode ?? ''} onChange={handleInputChange} />
    </div>
  );
}
