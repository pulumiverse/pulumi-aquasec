// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryInfrastructureKubernete;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryInfrastructureO;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryInfrastructure extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryInfrastructure Empty = new GetApplicationScopeCategoryInfrastructure();

    @Import(name="kubernetes")
    private @Nullable List<GetApplicationScopeCategoryInfrastructureKubernete> kubernetes;

    public Optional<List<GetApplicationScopeCategoryInfrastructureKubernete>> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }

    @Import(name="os")
    private @Nullable List<GetApplicationScopeCategoryInfrastructureO> os;

    public Optional<List<GetApplicationScopeCategoryInfrastructureO>> os() {
        return Optional.ofNullable(this.os);
    }

    private GetApplicationScopeCategoryInfrastructure() {}

    private GetApplicationScopeCategoryInfrastructure(GetApplicationScopeCategoryInfrastructure $) {
        this.kubernetes = $.kubernetes;
        this.os = $.os;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryInfrastructure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryInfrastructure $;

        public Builder() {
            $ = new GetApplicationScopeCategoryInfrastructure();
        }

        public Builder(GetApplicationScopeCategoryInfrastructure defaults) {
            $ = new GetApplicationScopeCategoryInfrastructure(Objects.requireNonNull(defaults));
        }

        public Builder kubernetes(@Nullable List<GetApplicationScopeCategoryInfrastructureKubernete> kubernetes) {
            $.kubernetes = kubernetes;
            return this;
        }

        public Builder kubernetes(GetApplicationScopeCategoryInfrastructureKubernete... kubernetes) {
            return kubernetes(List.of(kubernetes));
        }

        public Builder os(@Nullable List<GetApplicationScopeCategoryInfrastructureO> os) {
            $.os = os;
            return this;
        }

        public Builder os(GetApplicationScopeCategoryInfrastructureO... os) {
            return os(List.of(os));
        }

        public GetApplicationScopeCategoryInfrastructure build() {
            return $;
        }
    }

}
