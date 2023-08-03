branches
Type: Array, String, Object
Default: ['+([0-9])?(.{+([0-9]),x}).x', 'master', 'next', 'next-major', {name: 'beta', prerelease: true}, {name: 'alpha', prerelease: true}]
CLI arguments: --branches

The branches on which releases should happen. By default semantic-release will release:

regular releases to the default distribution channel from the branch master
regular releases to a distribution channel matching the branch name from any existing branch with a name matching a maintenance release range (N.N.x or N.x.x or N.x with N being a number)
regular releases to the next distribution channel from the branch next if it exists
regular releases to the next-major distribution channel from the branch next-major if it exists
pre-releases to the beta distribution channel from the branch beta if it exists
pre-releases to the alpha distribution channel from the branch alpha if it exists
Note: If your repository does not have a release branch, then semantic-release will fail with an ERELEASEBRANCHES error message. If you are using the default configuration, you can fix this error by pushing a master branch.
