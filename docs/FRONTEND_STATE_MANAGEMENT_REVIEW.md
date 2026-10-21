# Frontend State Management Review

Use this checklist when deciding where application state should live and how it should change.

- [ ] Keep short-lived input state close to the component that owns it.
- [ ] Share state only when multiple screens or components genuinely need it.
- [ ] Distinguish server data from local presentation state.
- [ ] Define loading, success, empty, and failure transitions for asynchronous requests.
- [ ] Prevent stale responses from overwriting newer user actions where relevant.
- [ ] Avoid duplicating derived state when it can be computed reliably.
- [ ] Reset or preserve state intentionally when navigating between screens.
- [ ] Keep error handling consistent with the existing application patterns.
- [ ] Add tests for important state transitions and edge cases.