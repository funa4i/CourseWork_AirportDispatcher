import { Link, Route, Routes } from 'react-router-dom';
import { FlightsPage } from '@/pages/flights-page';
import { CompaniesPage } from '@/pages/companies-page';
import { AirportsPage } from '@/pages/airports-page';
import { AircraftPage } from '@/pages/aircraft-page';
import { RoutesPage } from '@/pages/routes-page';
import { GatesPage } from '@/pages/gates-page';
import { DelayAlertsPage } from '@/pages/delay-alerts-page';

function Navigation() {
  return (
    <nav style={{ display: 'flex', gap: 12, padding: 16, borderBottom: '1px solid #ddd' }}>
      <Link to="/flights">Flights</Link>
      <Link to="/companies">Companies</Link>
      <Link to="/airports">Airports</Link>
      <Link to="/aircraft">Aircraft</Link>
      <Link to="/routes">Routes</Link>
      <Link to="/gates">Gates</Link>
      <Link to="/delay-alerts">Delay Alerts</Link>
    </nav>
  );
}

export function AppRouter() {
  return (
    <>
      <Navigation />
      <Routes>
        <Route path="/" element={<FlightsPage />} />
        <Route path="/flights" element={<FlightsPage />} />
        <Route path="/companies" element={<CompaniesPage />} />
        <Route path="/airports" element={<AirportsPage />} />
        <Route path="/aircraft" element={<AircraftPage />} />
        <Route path="/routes" element={<RoutesPage />} />
        <Route path="/gates" element={<GatesPage />} />
        <Route path="/delay-alerts" element={<DelayAlertsPage />} />
      </Routes>
    </>
  );
}
