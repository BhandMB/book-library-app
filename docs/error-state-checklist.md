# Client Error-State Checklist

- [ ] Loading state is visible while a request is pending.
- [ ] Empty results have a useful message and recovery path.
- [ ] 4xx responses show an actionable validation message.
- [ ] 401/403 responses explain authentication or permission needs.
- [ ] 5xx and timeout failures offer retry without losing current input.
- [ ] Unexpected response shapes fail safely instead of breaking the page.
