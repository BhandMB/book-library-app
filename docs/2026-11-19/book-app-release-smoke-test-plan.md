# Book App Release Smoke-Test Plan

## Critical user journeys
1. Open the application and reach the main book list.
2. Search and filter the catalogue.
3. Open a book detail view.
4. Create or edit a record if the current user is authorized.
5. Confirm validation feedback for invalid input.
6. Confirm expected behavior when the API is unavailable or returns an authorization error.

## Cross-cutting checks
- Verify responsive layout at narrow and desktop widths.
- Check keyboard navigation and visible focus.
- Confirm loading, empty, and error states are understandable.
- Confirm no protected data remains visible after logout or session expiry.
- Check browser console and network requests for unexpected errors.

## Release record
Record build identifier, browser and viewport, tester, pass/fail result, defects, and retest evidence. This plan is not a substitute for executing the checks.