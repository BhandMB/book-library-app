# Frontend API Integration Checklist

- [ ] API base URL is configured outside source code where appropriate.
- [ ] Requests use the expected HTTP method, path, and payload shape.
- [ ] Loading, success, empty, and failure states are handled.
- [ ] Validation errors are displayed in a useful way.
- [ ] Authentication failures do not expose protected content.
- [ ] Duplicate submissions are prevented where necessary.
- [ ] User-provided content is rendered safely.
- [ ] Network timeouts and unavailable services have recovery behavior.
- [ ] Tests cover successful and failed API responses.
- [ ] Local setup instructions describe required environment configuration.