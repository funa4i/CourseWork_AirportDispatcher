import { ChangeEvent } from 'react';
import { AircraftFilter } from '@/types/aircraft';

export function AircraftFilterForm({ value, onChange }: { value: AircraftFilter; onChange: (next: AircraftFilter) => void }) {
  function handleInputChange(event: ChangeEvent<HTMLInputElement>) {
    const { name, value: fieldValue } = event.target;
    onChange({ ...value, [name]: fieldValue || undefined, page: 0 });
  }

  return (
    <div style={{ display: 'grid', gap: 8, gridTemplateColumns: 'repeat(4, minmax(0, 1fr))', marginBottom: 16 }}>
      <input name="registrationNumber" placeholder="Регистрационный номер" value={value.registrationNumber ?? ''} onChange={handleInputChange} />
      <input name="serialNumber" placeholder="Серийный номер" value={value.serialNumber ?? ''} onChange={handleInputChange} />
      <input name="aircraftType" placeholder="Тип самолёта" value={value.aircraftType ?? ''} onChange={handleInputChange} />
      <input name="companyId" placeholder="ID компании" value={value.companyId ?? ''} onChange={handleInputChange} />
    </div>
  );
}
