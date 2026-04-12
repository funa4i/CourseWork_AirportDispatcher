import { PropsWithChildren } from 'react';

interface PageLayoutProps extends PropsWithChildren {
  title: string;
  subtitle?: string;
}

export function PageLayout({ title, subtitle, children }: PageLayoutProps) {
  return (
    <section style={{ padding: 16 }}>
      <h1>{title}</h1>
      {subtitle ? <p style={{ color: '#555' }}>{subtitle}</p> : null}
      {children}
    </section>
  );
}
