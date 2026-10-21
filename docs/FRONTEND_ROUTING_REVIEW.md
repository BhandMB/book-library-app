# Frontend Routing Review Checklist

Use this checklist when adding pages, nested routes, or navigation behavior.

- [ ] Each route maps to the intended screen.
- [ ] Direct navigation and page refresh work for supported routes.
- [ ] Unknown routes show a useful not-found page.
- [ ] Navigation links and browser back/forward behavior remain consistent.
- [ ] Protected screens, if any, do not rely on frontend routing as the only security boundary.
- [ ] Query parameters and route parameters are validated before use.
- [ ] Loading and error states are handled during route transitions.
- [ ] Links and controls have meaningful accessible names.
- [ ] Route changes are tested at desktop and mobile widths.