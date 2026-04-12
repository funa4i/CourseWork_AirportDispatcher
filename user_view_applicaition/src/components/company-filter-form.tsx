import { ChangeEvent } from 'react';
import { CompanyFilter } from '@/types/company';

interface CompanyFilterFormProps {
  value: CompanyFilter;
  onChange: (next: CompanyFilter) => void;
}

export function CompanyFilterForm({ value, onChange }: CompanyFilterFormProps) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({ ...value, [name]: fieldValue || undefined, page: 0 });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input name="name" placeholder="Название" value={value.name ?? ''} onChange={handleInputChange} />
      <input name="iataCode" placeholder="IATA" value={value.iataCode ?? ''} onChange={handleInputChange} />
      <input name="icaoCode" placeholder="ICAO" value={value.icaoCode ?? ''} onChange={handleInputChange} />
      <input name="digitalCode" placeholder="Цифровой код" value={value.digitalCode ?? ''} onChange={handleInputChange} />
    </div>
  );
}
