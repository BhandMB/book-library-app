# Frontend Error State Checklist

For each API-backed screen, verify the following states where relevant:

- [ ] Initial loading state is understandable.
- [ ] Empty results are distinguished from a failed request.
- [ ] Network failures show a helpful recovery action.
- [ ] Validation errors are associated with the relevant form fields.
- [ ] Authentication expiry is handled without exposing protected content.
- [ ] Retry actions avoid accidental duplicate submissions.
- [ ] Error messages do not reveal secrets or internal server details.
- [ ] Keyboard users can reach and understand the error message.
- [ ] State resets correctly after a successful retry.

Add automated component or end-to-end tests for important states.