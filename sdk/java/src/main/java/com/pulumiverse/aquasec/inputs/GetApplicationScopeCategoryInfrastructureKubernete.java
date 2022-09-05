// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryInfrastructureKuberneteVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryInfrastructureKubernete extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryInfrastructureKubernete Empty = new GetApplicationScopeCategoryInfrastructureKubernete();

    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    @Import(name="variables")
    private @Nullable List<GetApplicationScopeCategoryInfrastructureKuberneteVariable> variables;

    public Optional<List<GetApplicationScopeCategoryInfrastructureKuberneteVariable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetApplicationScopeCategoryInfrastructureKubernete() {}

    private GetApplicationScopeCategoryInfrastructureKubernete(GetApplicationScopeCategoryInfrastructureKubernete $) {
        this.expression = $.expression;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryInfrastructureKubernete defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryInfrastructureKubernete $;

        public Builder() {
            $ = new GetApplicationScopeCategoryInfrastructureKubernete();
        }

        public Builder(GetApplicationScopeCategoryInfrastructureKubernete defaults) {
            $ = new GetApplicationScopeCategoryInfrastructureKubernete(Objects.requireNonNull(defaults));
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public Builder variables(@Nullable List<GetApplicationScopeCategoryInfrastructureKuberneteVariable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetApplicationScopeCategoryInfrastructureKuberneteVariable... variables) {
            return variables(List.of(variables));
        }

        public GetApplicationScopeCategoryInfrastructureKubernete build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
