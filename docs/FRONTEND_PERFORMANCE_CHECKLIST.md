# Frontend Performance Checklist

Use these checks when investigating slow screens or preparing a release.

## Network and rendering
- [ ] Avoid repeated API requests for the same unchanged data.
- [ ] Show useful loading feedback for slow requests.
- [ ] Render long lists efficiently and consider pagination where appropriate.
- [ ] Avoid unnecessary full-page refreshes after small updates.
- [ ] Confirm images and static assets load at appropriate sizes.

## Resilience
- [ ] Handle slow, failed, and empty API responses.
- [ ] Avoid duplicate submissions during pending mutations.
- [ ] Cancel or ignore stale requests when navigation makes their results irrelevant, where supported.

## Measurement
- [ ] Reproduce the issue before optimizing.
- [ ] Use browser performance and network tools to identify the bottleneck.
- [ ] Compare behavior before and after the change on the same scenario.
- [ ] Verify responsive layouts and keyboard interactions still work.