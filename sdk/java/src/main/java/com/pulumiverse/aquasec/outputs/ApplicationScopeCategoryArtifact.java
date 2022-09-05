// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.ApplicationScopeCategoryArtifactCf;
import com.pulumiverse.aquasec.outputs.ApplicationScopeCategoryArtifactFunction;
import com.pulumiverse.aquasec.outputs.ApplicationScopeCategoryArtifactImage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationScopeCategoryArtifact {
    private final @Nullable List<ApplicationScopeCategoryArtifactCf> cfs;
    private final @Nullable List<ApplicationScopeCategoryArtifactFunction> functions;
    private final @Nullable List<ApplicationScopeCategoryArtifactImage> images;

    @CustomType.Constructor
    private ApplicationScopeCategoryArtifact(
        @CustomType.Parameter("cfs") @Nullable List<ApplicationScopeCategoryArtifactCf> cfs,
        @CustomType.Parameter("functions") @Nullable List<ApplicationScopeCategoryArtifactFunction> functions,
        @CustomType.Parameter("images") @Nullable List<ApplicationScopeCategoryArtifactImage> images) {
        this.cfs = cfs;
        this.functions = functions;
        this.images = images;
    }

    public List<ApplicationScopeCategoryArtifactCf> cfs() {
        return this.cfs == null ? List.of() : this.cfs;
    }
    public List<ApplicationScopeCategoryArtifactFunction> functions() {
        return this.functions == null ? List.of() : this.functions;
    }
    public List<ApplicationScopeCategoryArtifactImage> images() {
        return this.images == null ? List.of() : this.images;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScopeCategoryArtifact defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationScopeCategoryArtifactCf> cfs;
        private @Nullable List<ApplicationScopeCategoryArtifactFunction> functions;
        private @Nullable List<ApplicationScopeCategoryArtifactImage> images;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationScopeCategoryArtifact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cfs = defaults.cfs;
    	      this.functions = defaults.functions;
    	      this.images = defaults.images;
        }

        public Builder cfs(@Nullable List<ApplicationScopeCategoryArtifactCf> cfs) {
            this.cfs = cfs;
            return this;
        }
        public Builder cfs(ApplicationScopeCategoryArtifactCf... cfs) {
            return cfs(List.of(cfs));
        }
        public Builder functions(@Nullable List<ApplicationScopeCategoryArtifactFunction> functions) {
            this.functions = functions;
            return this;
        }
        public Builder functions(ApplicationScopeCategoryArtifactFunction... functions) {
            return functions(List.of(functions));
        }
        public Builder images(@Nullable List<ApplicationScopeCategoryArtifactImage> images) {
            this.images = images;
            return this;
        }
        public Builder images(ApplicationScopeCategoryArtifactImage... images) {
            return images(List.of(images));
        }        public ApplicationScopeCategoryArtifact build() {
            return new ApplicationScopeCategoryArtifact(cfs, functions, images);
        }
    }
}
