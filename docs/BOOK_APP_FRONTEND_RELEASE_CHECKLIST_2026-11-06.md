# Book Library App Frontend Release Checklist

Date: 2026-11-06

## Build and configuration
- [ ] Production build completes from a clean checkout.
- [ ] Environment-specific API base URL is correct.
- [ ] No development secrets or local URLs are bundled.
- [ ] Static assets load without missing-file errors.

## User workflows
- [ ] Browse and search books.
- [ ] Open a book detail view.
- [ ] Create, edit, and delete according to permissions.
- [ ] Verify loading, empty, validation, and server-error states.
- [ ] Confirm refresh and browser navigation behave correctly.

## Quality
- [ ] Check keyboard access and responsive layouts.
- [ ] Review browser console and network failures.
- [ ] Confirm no sensitive data is written to client logs.
- [ ] Verify API compatibility with the target backend release.

Record build version, browser matrix, test evidence, and known issues before sign-off.