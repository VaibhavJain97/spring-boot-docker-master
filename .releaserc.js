module.exports = {
  branches: ['release/release'], // Change this to the name of your default branch
  plugins: [
    "@semantic-release/commit-analyzer",
    "@semantic-release/release-notes-generator",
    "@semantic-release/changelog",
    "@semantic-release/github",
    "@semantic-release/git",
  ],
  // Specify the commit types that are allowed
  preset: 'conventionalcommits',
  presetConfig: {
    types: [
      { type: 'breaking', section: 'Breaking Changes' },
      { type: 'feat', section: 'Features' },
      { type: 'fix', section: 'Bug Fixes' },
    ],
  },
};
