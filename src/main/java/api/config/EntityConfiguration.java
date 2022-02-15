package api.config;

import services.DelBookService;

public enum EntityConfiguration {


    GETBOOK {
        @Override
        public Class<?> getEntityService() { return services.GetBookService.class; }
    },
    POSTBOOK {
        @Override
        public Class<?> getEntityService() { return services.PostBookService.class; }
    },
    PATCHBOOK {
        @Override
        public Class<?> getEntityService() { return services.PatchBookService.class; }
    },
    DELBOOK {
        @Override
        public Class<?> getEntityService() { return services.DelBookService.class; }
    };

    public abstract Class<?> getEntityService();
}



