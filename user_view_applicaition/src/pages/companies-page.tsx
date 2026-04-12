import { useState } from 'react';
import { useCompanies } from '@/api/companies.api';
import { CompanyFilter } from '@/types/company';
import { CompanyFilterForm } from '@/components/company-filter-form';
import { CompanyTable } from '@/components/company-table';
import { PageLayout } from '@/components/page-layout';

const defaultFilter: CompanyFilter = {
  page: 0,
  size: 20,
};

export function CompaniesPage() {
  const [filter, setFilter] = useState<CompanyFilter>(defaultFilter);
  const { data, isLoading, error } = useCompanies(filter);

  return (
    <PageLayout title="Companies" subtitle="Каркас страницы авиакомпаний">
      <CompanyFilterForm value={filter} onChange={setFilter} />
      {isLoading ? <p>Загрузка...</p> : null}
      {error ? <p>Ошибка загрузки компаний</p> : null}
      <CompanyTable items={data?.content ?? []} />
    </PageLayout>
  );
}
