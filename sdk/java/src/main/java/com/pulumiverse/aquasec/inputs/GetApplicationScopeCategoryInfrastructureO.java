// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryInfrastructureOVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryInfrastructureO extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryInfrastructureO Empty = new GetApplicationScopeCategoryInfrastructureO();

    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    @Import(name="variables")
    private @Nullable List<GetApplicationScopeCategoryInfrastructureOVariable> variables;

    public Optional<List<GetApplicationScopeCategoryInfrastructureOVariable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetApplicationScopeCategoryInfrastructureO() {}

    private GetApplicationScopeCategoryInfrastructureO(GetApplicationScopeCategoryInfrastructureO $) {
        this.expression = $.expression;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryInfrastructureO defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryInfrastructureO $;

        public Builder() {
            $ = new GetApplicationScopeCategoryInfrastructureO();
        }

        public Builder(GetApplicationScopeCategoryInfrastructureO defaults) {
            $ = new GetApplicationScopeCategoryInfrastructureO(Objects.requireNonNull(defaults));
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public Builder variables(@Nullable List<GetApplicationScopeCategoryInfrastructureOVariable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetApplicationScopeCategoryInfrastructureOVariable... variables) {
            return variables(List.of(variables));
        }

        public GetApplicationScopeCategoryInfrastructureO build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
