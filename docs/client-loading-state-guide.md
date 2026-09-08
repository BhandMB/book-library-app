# Client Loading-State Guide

Every data-backed screen should make these states explicit:

1. Initial loading: show progress without suggesting an error.
2. Loaded with data: render the normal content.
3. Loaded empty: explain that no records match and offer the next action.
4. Request failure: show a concise message and a retry path.
5. Retry in progress: prevent duplicate submissions while the request is active.

Keep loading and error state transitions predictable so UI tests can assert them reliably.
