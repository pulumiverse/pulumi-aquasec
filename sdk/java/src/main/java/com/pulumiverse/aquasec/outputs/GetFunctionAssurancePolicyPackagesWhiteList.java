// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAssurancePolicyPackagesWhiteList {
    private final String arch;
    private final String display;
    private final String epoch;
    private final String format;
    private final String license;
    private final String name;
    private final String release;
    private final String version;
    private final String versionRange;

    @CustomType.Constructor
    private GetFunctionAssurancePolicyPackagesWhiteList(
        @CustomType.Parameter("arch") String arch,
        @CustomType.Parameter("display") String display,
        @CustomType.Parameter("epoch") String epoch,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("license") String license,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("release") String release,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionRange") String versionRange) {
        this.arch = arch;
        this.display = display;
        this.epoch = epoch;
        this.format = format;
        this.license = license;
        this.name = name;
        this.release = release;
        this.version = version;
        this.versionRange = versionRange;
    }

    public String arch() {
        return this.arch;
    }
    public String display() {
        return this.display;
    }
    public String epoch() {
        return this.epoch;
    }
    public String format() {
        return this.format;
    }
    public String license() {
        return this.license;
    }
    public String name() {
        return this.name;
    }
    public String release() {
        return this.release;
    }
    public String version() {
        return this.version;
    }
    public String versionRange() {
        return this.versionRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAssurancePolicyPackagesWhiteList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arch;
        private String display;
        private String epoch;
        private String format;
        private String license;
        private String name;
        private String release;
        private String version;
        private String versionRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionAssurancePolicyPackagesWhiteList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arch = defaults.arch;
    	      this.display = defaults.display;
    	      this.epoch = defaults.epoch;
    	      this.format = defaults.format;
    	      this.license = defaults.license;
    	      this.name = defaults.name;
    	      this.release = defaults.release;
    	      this.version = defaults.version;
    	      this.versionRange = defaults.versionRange;
        }

        public Builder arch(String arch) {
            this.arch = Objects.requireNonNull(arch);
            return this;
        }
        public Builder display(String display) {
            this.display = Objects.requireNonNull(display);
            return this;
        }
        public Builder epoch(String epoch) {
            this.epoch = Objects.requireNonNull(epoch);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder license(String license) {
            this.license = Objects.requireNonNull(license);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder release(String release) {
            this.release = Objects.requireNonNull(release);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionRange(String versionRange) {
            this.versionRange = Objects.requireNonNull(versionRange);
            return this;
        }        public GetFunctionAssurancePolicyPackagesWhiteList build() {
            return new GetFunctionAssurancePolicyPackagesWhiteList(arch, display, epoch, format, license, name, release, version, versionRange);
        }
    }
}
