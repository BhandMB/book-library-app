# Client State Management

Keep loading, success, empty, and failure states explicit so the library UI remains understandable during slow or unreliable requests.

## State transitions
- Initial request: show loading without displaying stale success text.
- Successful response with records: render the collection and available actions.
- Successful empty response: show an intentional empty state.
- Request failure: preserve safe retry context and show actionable feedback.
- New request after failure: clear obsolete error messaging only when the request begins.

## Regression checks
Verify refresh, retry, navigation away and back, duplicate submissions, and partial data responses.