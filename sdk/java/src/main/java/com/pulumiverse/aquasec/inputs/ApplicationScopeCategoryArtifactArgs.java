// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.ApplicationScopeCategoryArtifactCfArgs;
import com.pulumiverse.aquasec.inputs.ApplicationScopeCategoryArtifactFunctionArgs;
import com.pulumiverse.aquasec.inputs.ApplicationScopeCategoryArtifactImageArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationScopeCategoryArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationScopeCategoryArtifactArgs Empty = new ApplicationScopeCategoryArtifactArgs();

    @Import(name="cfs")
    private @Nullable Output<List<ApplicationScopeCategoryArtifactCfArgs>> cfs;

    public Optional<Output<List<ApplicationScopeCategoryArtifactCfArgs>>> cfs() {
        return Optional.ofNullable(this.cfs);
    }

    @Import(name="functions")
    private @Nullable Output<List<ApplicationScopeCategoryArtifactFunctionArgs>> functions;

    public Optional<Output<List<ApplicationScopeCategoryArtifactFunctionArgs>>> functions() {
        return Optional.ofNullable(this.functions);
    }

    @Import(name="images")
    private @Nullable Output<List<ApplicationScopeCategoryArtifactImageArgs>> images;

    public Optional<Output<List<ApplicationScopeCategoryArtifactImageArgs>>> images() {
        return Optional.ofNullable(this.images);
    }

    private ApplicationScopeCategoryArtifactArgs() {}

    private ApplicationScopeCategoryArtifactArgs(ApplicationScopeCategoryArtifactArgs $) {
        this.cfs = $.cfs;
        this.functions = $.functions;
        this.images = $.images;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScopeCategoryArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScopeCategoryArtifactArgs $;

        public Builder() {
            $ = new ApplicationScopeCategoryArtifactArgs();
        }

        public Builder(ApplicationScopeCategoryArtifactArgs defaults) {
            $ = new ApplicationScopeCategoryArtifactArgs(Objects.requireNonNull(defaults));
        }

        public Builder cfs(@Nullable Output<List<ApplicationScopeCategoryArtifactCfArgs>> cfs) {
            $.cfs = cfs;
            return this;
        }

        public Builder cfs(List<ApplicationScopeCategoryArtifactCfArgs> cfs) {
            return cfs(Output.of(cfs));
        }

        public Builder cfs(ApplicationScopeCategoryArtifactCfArgs... cfs) {
            return cfs(List.of(cfs));
        }

        public Builder functions(@Nullable Output<List<ApplicationScopeCategoryArtifactFunctionArgs>> functions) {
            $.functions = functions;
            return this;
        }

        public Builder functions(List<ApplicationScopeCategoryArtifactFunctionArgs> functions) {
            return functions(Output.of(functions));
        }

        public Builder functions(ApplicationScopeCategoryArtifactFunctionArgs... functions) {
            return functions(List.of(functions));
        }

        public Builder images(@Nullable Output<List<ApplicationScopeCategoryArtifactImageArgs>> images) {
            $.images = images;
            return this;
        }

        public Builder images(List<ApplicationScopeCategoryArtifactImageArgs> images) {
            return images(Output.of(images));
        }

        public Builder images(ApplicationScopeCategoryArtifactImageArgs... images) {
            return images(List.of(images));
        }

        public ApplicationScopeCategoryArtifactArgs build() {
            return $;
        }
    }

}
