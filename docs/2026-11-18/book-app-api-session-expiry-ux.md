# API Session Expiry UX

## User impact
An expired session can interrupt searches, edits, or other work. The app should distinguish authentication expiry from a network outage or server error.

## Expected handling
- Detect the API's documented unauthorized response.
- Clear invalid client authentication state and avoid retry loops.
- Preserve non-sensitive form input where feasible.
- Explain that the session expired and provide a clear sign-in action.
- Redirect to the originally requested page only after successful authentication.
- Never store passwords or session tokens in persistent browser storage unless the architecture explicitly requires and secures it.

## Test cases
Cover expiry during page load, search, and form submission; repeated unauthorized responses; offline behavior; and successful re-authentication. Confirm that protected data is not rendered from stale client state after expiry.