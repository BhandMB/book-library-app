# Frontend Release Checklist

## Build and runtime
- [ ] Install dependencies using the project's documented lockfile workflow.
- [ ] Run linting, type checks, and tests when configured.
- [ ] Produce a clean production build.
- [ ] Verify required environment variables are documented and safe.
- [ ] Check browser console output and failed network requests.

## User flows
- [ ] Verify primary navigation and direct-route behavior.
- [ ] Test loading, empty, success, and failure states.
- [ ] Check authentication/session behavior if applicable.
- [ ] Verify forms prevent accidental duplicate submissions.
- [ ] Check mobile and desktop layouts.

## Delivery
- [ ] Confirm API base URL and environment-specific settings.
- [ ] Avoid committing secrets, local environment files, or generated artifacts.
- [ ] Update setup instructions and known limitations.
- [ ] Confirm the deployed build corresponds to the intended commit.