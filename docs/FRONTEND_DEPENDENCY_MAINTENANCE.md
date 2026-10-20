# Frontend Dependency Maintenance Guide

Use this guide when reviewing dependency changes in the frontend repository.

- [ ] Read the package changelog and breaking-change notes before upgrading.
- [ ] Keep the package manager lockfile consistent with the manifest.
- [ ] Prefer small, reviewable upgrades over unrelated bulk changes.
- [ ] Run the project's configured lint, type-check, test, and production-build commands.
- [ ] Verify key user flows after upgrades to routing, forms, state management, or HTTP clients.
- [ ] Check for known security advisories using trusted tooling.
- [ ] Remove unused dependencies only after confirming they are not used by scripts or tooling.
- [ ] Do not commit local caches, secrets, or generated build directories.
- [ ] Record any required configuration changes in the README.