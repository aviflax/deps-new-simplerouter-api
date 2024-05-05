# simplerouter-api-template

A [deps-new] template for creating a Web API with [clj-simple-router].

## Usage

First install [deps-new]:

```bash
clojure -Ttools install-latest :lib io.github.seancorfield/deps-new :as new
```

Now create a new project using this template:

```shell
clojure -Tnew create \
  :template io.github.aviflax/simplerouter-api-template \
  :name myname/myproject
```

This will create the new project in a new directory `myproject`.



## Copyright

Copyright © 2024 [Avi Flax]


[Avi Flax]: mailto:avi@aviflax.com
[clj-simple-router]: https://github.com/tonsky/clj-simple-router
[deps-new]: https://github.com/seancorfield/deps-new
