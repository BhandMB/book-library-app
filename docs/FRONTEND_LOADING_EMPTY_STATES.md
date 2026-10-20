# Frontend Loading and Empty States

Use these guidelines when designing data-driven screens.

## Loading
- [ ] Show a clear loading indicator for requests that take noticeable time.
- [ ] Avoid showing stale data as if it were the result of a new query.
- [ ] Prevent duplicate submissions where appropriate.

## Empty results
- [ ] Distinguish a valid empty result from a failed request.
- [ ] Explain what the user can do next, such as changing a filter or adding a record.
- [ ] Ensure empty states remain accessible to assistive technology.

## Failure and recovery
- [ ] Provide a useful message when a request fails.
- [ ] Offer retry when retrying is safe.
- [ ] Preserve user input after a failed form submission when possible.
- [ ] Avoid exposing raw server errors or stack traces.

## Verification
- [ ] Check loading, empty, populated, and failure states.
- [ ] Check responsive layouts and keyboard navigation.
- [ ] Confirm state transitions do not flash misleading content.