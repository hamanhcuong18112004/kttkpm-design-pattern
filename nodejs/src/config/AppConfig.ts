// 1. Define an interface for the configuration object
interface ConfigMap {
    dbHost: string;
    dbPort: number;
    shopName: string;
    maxOrders: number;
}

class AppConfig {
    private static instance: AppConfig;
    private configs: ConfigMap;

    // 2. The constructor MUST be private in a Singleton
    private constructor() {
        this.configs = {
            dbHost: "localhost",
            dbPort: 5432,
            shopName: "Highland Coffee",
            maxOrders: 100,
        };
    }

    // 3. Proper instantiation logic
    public static getInstance(): AppConfig {
        if (!AppConfig.instance) {
            AppConfig.instance = new AppConfig();
        }
        return AppConfig.instance;
    }

    // 4. Use Generics and 'keyof' for strict type safety
    public getConfig<K extends keyof ConfigMap>(key: K): ConfigMap[K] {
        return this.configs[key];
    }

    public setConfig<K extends keyof ConfigMap>(
        key: K,
        value: ConfigMap[K],
    ): void {
        this.configs[key] = value;
    }
}

export default AppConfig;
